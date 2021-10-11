package linkedListChallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

public class Main {
	
	private static ArrayList<Album> albums = new ArrayList<Album>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Album album = new Album("Demo Album", "Demo Artist");
		album.addSong("Song 1", 4.20);
		album.addSong("Song 2", 3.40);
		album.addSong("Song 3", 5.40);
		album.addSong("Song 4", 2.40);
		album.addSong("Song 5", 3.50);
		album.addSong("Song 6", 4.50);
		album.addSong("Song 7", 2.30);
		album.addSong("Song 8", 4.00);
		album.addSong("Song 9", 1.40);
		albums.add(album);
		
		album = new Album("Demo 2", "Demo singer");
		album.addSong(" 1", 5.45);
		album.addSong(" 2", 6.24);
		album.addSong(" 3", 2.43);
		album.addSong(" 4", 5.43);
		album.addSong(" 5", 3.52);
		album.addSong(" 6", 3.52);
		album.addSong(" 7", 4.42);
		album.addSong(" 8", 3.33);
		album.addSong(" 9", 2.41);
		albums.add(album);
		
		LinkedList<Song> playList = new LinkedList<Song>();
		albums.get(0).addToPlayList("Song 1", playList);
		albums.get(0).addToPlayList("Song 2", playList);
		albums.get(0).addToPlayList("Song 15", playList);
		
		albums.get(0).addToPlayList(9, playList);
		albums.get(0).addToPlayList(8, playList);
		albums.get(0).addToPlayList(3, playList);
		albums.get(0).addToPlayList(2, playList);
		albums.get(0).addToPlayList(24, playList);
		
		play(playList);
		
		
		
		
		
	}

	private static void play(LinkedList<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("We have reaached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("We have reaached the end of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(!forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now replaying " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("We are at the start of te list");
					}
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We are at the start of te list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					} else if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions\npress");
		System.out.println("0 - To quit\n" + 
				"1 - To play next song\n" + 
				"2 - To play previous song\n" +
				"3 - To replay the current song\n" +
				"4 - List songs in the playlist\n" +
				"5 - Print the available actions\n" +
				"6 - Delete current song from playlist");
	}
	
	private static void printList(LinkedList<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("==============================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("==============================");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

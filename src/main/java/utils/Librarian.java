package utils;

import model.CompareUsers;
import model.LendByFirstComeFirstServe;
import model.Person;
import model.lendByPriority;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Librarian extends Person implements lendByPriority, LendByFirstComeFirstServe {
//    The Librarian class processes book request from the requestCatalogue and processes
//    request based on two implemented interface methods ie: LendBookByPriority and
//    leandBookFirstComeFirstServe

    public Librarian(String name, String libraryCardId) {
        super(name, libraryCardId);
    }

    //    The lendBookByPriority method picks book request entry of the highest priority regardless
//    of insertion order this is for a case when users are asking for thesame book;
//    The lendBookByPriority method call bookshelf to get the book request
    @Override
    public String lendBookByPriority() throws IOException {

        try {
            RequestCatalogue request = new RequestCatalogue();
            PriorityQueue<LibraryUsers> priorityQueue = new PriorityQueue<>(11, new CompareUsers());
            request.requestEntrySheet();
            priorityQueue.addAll(request.getCatalogue1());
            String book = Objects.requireNonNull(priorityQueue.poll()).getBookRequest();
            System.out.println(book);

            BookShelf bookShelf = new BookShelf();
            bookShelf.getBook(book);
            return book;
        }catch (Exception ex) {
            ex.printStackTrace();
            return "No such book";
        }
    }

    //    The lendBookFirstComeFirstServe method picks book request first request regardless of users priority
//    this is for a case where users are asking for different books
//    The lendBookFirstComeFirstServe method call bookshelf to get the book request
    @Override
    public String lendBookFirstComeFirstServe() throws IOException {

        try {
            RequestCatalogue request = new RequestCatalogue();
            Queue<LibraryUsers> queues = new LinkedList<>(request.getCatalogue3());
            request.requestEntrySheet();
            queues.addAll(request.getCatalogue3());
            String book = Objects.requireNonNull(queues.poll()).getBookRequest();
            System.out.println(book);

            BookShelf bookShelf = new BookShelf();
            bookShelf.getBook(book);
            return book;
        }catch (Exception ex) {
            ex.printStackTrace();
            return "No such book";
        }

    }
}

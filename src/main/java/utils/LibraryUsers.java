package utils;

import model.Person;

;

public class LibraryUsers extends Person {
    private final String position;
    private final String name;
    private String bookRequest;
    private int rank;

    /**
     *
     * @param position keeps position of an instance eg Teacher, Senior, Junior
     * @param rank holds rank of an instance used for comparing
     * @param bookRequest holds book request for an instance
     */
    public LibraryUsers(String position, String name, String libraryCardId, int rank, String bookRequest) {
        super(name , libraryCardId);
        this.name = name;
        this.position = position;
        this.rank = rank;
        this.bookRequest = bookRequest;

    }

    public int getRank() {
        return rank;
    }

    public String getBookRequest() {
        return bookRequest;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setBookRequest(String bookRequest) {
        this.bookRequest = bookRequest;
    }

    @Override
    public String toString() {
        return "LibraryUsers{" +
                "position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", bookRequest='" + bookRequest + '\'' +
                ", rank=" + rank +
                '}';
    }
}

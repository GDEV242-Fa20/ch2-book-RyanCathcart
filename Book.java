/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ryan Cathcart
 * @version Sep 21, 2020
 */
class Book
{
     // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /** Satisfies the requirement of problem 2.83.
     * Provide access to the string holding the author's name
     * @return author
     */
    public String getAuthor()
    {
        return author;
    }
    
    /** Satisfies the requirement of problem 2.83.
     * Provide access to the string holding the book's title
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /** Satisfies the requirement of problem 2.84.
     * Prints the current author of this Book.
     */
    public void printAuthor() {
        System.out.println(author);
    }
    
    /** Satisfies the requirement of problem 2.84.
     * Prints the current title of this Book.
     */
    public void printTitle() {
        System.out.println(title);
    }
}
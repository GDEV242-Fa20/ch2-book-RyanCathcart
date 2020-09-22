/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Ryan Cathcart
 * @version Sep 21, 2020
 * 
 * 
 * PROBLEM 2.86 Are the Book objects you have implemented immutable? Justify your answer: 
 * The Book objects implemented are immutable because the variables are set at the creation of the 
 * object, and there are no mutator/setter methods to change the objects' fields.
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    // Satisfies the requirement of problem 2.85.
    private int pages;
    // Satisfies the requirement of problem 2.88.
    private String refNumber;

    /** Satisfies the requirement of problem 2.85 and 2.88.
     * Set the author, title, pages, and refNumber fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    
    /** Satisfies the requirement of problem 2.85.
     * Provide access to the int holding the book's number of pages
     * @return pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /** Satisfies the requirement of problem 2.88.
     * Provide access to the string holding the book's refNumber
     * @return refNumber
     */
    public String getRefNumber()
    {
        return refNumber;
    }
    
    /** Satisfies the requirement of problem 2.88.
     * Sets the refNumber of this Book
     * @param ref The new refNum for this Book.
     */
    public void setRefNumber(String ref)
    {
        refNumber = ref;
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
    
    /** Satisfies the requirement of problem 2.87 and 2.89.
     * Prints the current title, author, and pages of this Book.
     */
    public void printDetails() {
        System.out.print("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: ");
        if (refNumber.length() > 0) {
            System.out.println(refNumber);
        } else {
            System.out.println("ZZZ");
        }
    }
}
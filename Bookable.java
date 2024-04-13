// added interfaces in code to allow for better polymorphism
public interface Bookable {
    boolean book(); // Returns true if booking is successful, false otherwise
    void release();
}   
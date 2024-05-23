# Movie Seat Selector

This project is a simple Java application that simulates a movie theater seating reservation system.

## Features

- Display the seating chart
- Reserve a seat

## How to Run

1. Compile the `src/MovieTheater.java` file.
2. Run the compiled `MovieTheater` class.

```bash
javac src/MovieTheater.java
java -cp src MovieTheater
```

# Example Output

Seating Chart:
0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 
0 0 0 0 0 

Seat reserved successfully.
Seating Chart:
0 0 0 0 0 
0 0 0 0 0 
0 0 0 X 0 
0 0 0 0 0 
0 0 0 0 0 

Seat already taken.
Seating Chart:
0 0 0 0 0 
0 0 0 0 0 
0 0 0 X 0 
0 0 0 0 0 
0 0 0 0 0 

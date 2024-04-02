// script.js - Created by [Jaylan McCoy]

// Function to process data
function processData() {
    // Generate a random number between 1 and 10
    var randomNumber = Math.ceil(Math.random() * 10);
    
    // Log the random number to the console
    console.log("Random number generated:", randomNumber);
    
    // Check if the random number is even or odd using if/else statement
    if (randomNumber % 2 === 0) {
        console.log("The random number is even.");
    } else {
        console.log("The random number is odd.");
    }
    
    // Loop to repeat a task (in this case, logging numbers from 1 to 5)
    console.log("Numbers from 1 to 5:");
    for (var i = 1; i <= 5; i++) {
        console.log(i);
    }
    
    // String manipulation - Concatenating strings and displaying the result
    var message = "Hello, ";
    var name = "World!";
    var greeting = message + name;
    console.log(greeting);
}

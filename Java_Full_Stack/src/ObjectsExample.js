let book = {};
let library = new Object();

console.log(typeof book);
console.log(typeof library);

// Arrow functions
let sum = (a, b) => a + b;

sum(3, 4);

// Function constructor
const mult = new Function("a", "b", "c", "c", "return a + b + c + d");

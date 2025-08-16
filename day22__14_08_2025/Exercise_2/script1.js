let numbers = [1, 2, 3, 4];
const doubleNumbers = arr => arr.map(num => num * 2);

let doubled = doubleNumbers(numbers);

console.log("Original Array:", numbers);
console.log("Doubled Array:", doubled);

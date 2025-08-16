// Generic function to return a tuple
function pair(first, second) {
    return [first, second];
}
// Example usage
var numberStringPair = pair(10, "Hello");
var stringBooleanPair = pair("Sumaiya", true);
var mixedPair = pair("Xiaomi", 13); // Type inference works
// Print results
console.log("Number-String Pair:", numberStringPair);
console.log("String-Boolean Pair:", stringBooleanPair);
console.log("Mixed Pair:", mixedPair);

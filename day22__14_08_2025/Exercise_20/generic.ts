
function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let numberStringPair = pair<number, string>(10, "Hello");
let stringBooleanPair = pair<string, boolean>("Sumaiya", true);
let mixedPair = pair("Xiaomi", 13);

console.log("Number-String Pair:", numberStringPair);
console.log("String-Boolean Pair:", stringBooleanPair);
console.log("Mixed Pair:", mixedPair);

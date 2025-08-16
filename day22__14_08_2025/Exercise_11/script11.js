function separateFirstRest(...args) {
    let [first, ...rest] = args;
    return { first, rest };
}

let result = separateFirstRest(10, 20, 30, 40, 50);

console.log(result); 


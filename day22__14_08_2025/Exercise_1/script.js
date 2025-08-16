let numbers = [5, 10, 15, 20, 25];

let getSum = arr => arr.reduce((total, num) => total + num, 0);

console.log(getSum(numbers));

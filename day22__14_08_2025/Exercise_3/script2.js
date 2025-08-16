class Util {
    static getDate() {
        let today = new Date();
        let dd = String(today.getDate());
        let mm = String(today.getMonth());
        let yyyy = today.getFullYear();
        return `${dd}-${mm}-${yyyy}`;
    }


    static getPIValue() {
        return Math.PI;
    }



    static convertC2F(celsius) {
        return (celsius * 9/5) + 32;
    }


    static getFibonacci(n) {
        if (n <= 0) return [];
        if (n === 1) return [0];
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i - 1] + fib[i - 2]);
        }
        return fib;
    }
}


console.log("Today's Date:", Util.getDate());
console.log("PI Value:", Util.getPIValue());
console.log("25°C in Fahrenheit:", Util.convertC2F(25));
console.log("First 5 Fibonacci numbers:", Util.getFibonacci(5));

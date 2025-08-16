class Vehicle {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    getInfo() {
        return `${this.year} ${this.make} ${this.model}`;
    }
}

class Car extends Vehicle {
    constructor(make, model, year, numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    getInfo() {
        return `${super.getInfo()} - ${this.numDoors} doors`;
    }
}

let vehicle = new Vehicle("Toyota", "Corolla", 2020);
console.log(vehicle.getInfo()); 

let car = new Car("Honda", "Civic", 2022, 4);
console.log(car.getInfo()); 

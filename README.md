// IT-OOPROG21 | Laboratory Activity 4 | Encapsulation

Name: Christian Chael M. Lesoy
Section: 2E
Activity: Lab 4 - Encapsulation
Date: October 2, 2026

// Description

This activity refactors the constructor-based Vehicle program using encapsulation. The fields `brand`, `model`, and `year` are made private, with public getters used to access their values. The year is also validated so that only values from 1886 to 2026 are accepted.

The `setYear()` method was added to allow valid year updates while preventing invalid values from changing the current year.

// Vehicles

The program uses the three original vehicles:

* Toyota Corolla - 2020
* Honda Civic - 1995
* Ford Mustang - 2010

// Required Tests

The program tests:

* `setYear(2000)` → `true`, year becomes 2000
* `setYear(1885)` → `false`, year remains 2000
* `setYear(2027)` → `false`, year remains 2000
* Constructor with year `1885` → year becomes 2026
* Constructor with year `2027` → year becomes 2026

// Console Output

Brand: Toyota, Model: Corolla, Year: 2020
Brand: Toyota
Model: Corolla
Year: 2020
Age: 6
Vintage: false

Brand: Honda, Model: Civic, Year: 1995
Brand: Honda
Model: Civic
Year: 1995
Age: 31
Vintage: true

Brand: Ford, Model: Mustang, Year: 2010
Brand: Ford
Model: Mustang
Year: 2010
Age: 16
Vintage: false

setYear(2000): true
Year: 2000
Age: 26
Vintage: true

setYear(1885): false
Year: 2000

setYear(2027): false
Year: 2000

New vehicle with year 1885:
Initial year: 2026

New vehicle with year 2027:
Initial year: 2026


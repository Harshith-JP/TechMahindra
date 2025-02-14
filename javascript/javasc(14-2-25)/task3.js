function isPrime(num) {
    if (num <= 1) return console.log(num + " is not prime");
    if (num <= 3) return console.log(num + " is prime");
    if (num % 2 === 0 || num % 3 === 0) return console.log(num + " is not prime");
    for (let i = 5; i * i <= num; i += 6) {
        if (num % i === 0 || num % (i + 2) === 0) return console.log(num + " is not prime");
    }
    console.log(num + " is prime");
}
const num = 44;
isPrime(num);

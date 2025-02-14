let tomatoPrices = [45, 50, 55, 52, 49, 53, 51];
let sum = tomatoPrices.reduce((acc, price) => acc + price, 0);
let avg = sum / tomatoPrices.length;
console.log(avg > 50 ? "Tomato has given good profit." : "No profit from tomato.");

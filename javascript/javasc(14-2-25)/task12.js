let firstNumber = prompt("Enter the first number: ");
let secondNumber = prompt("Enter the second number: ");

firstNumber = parseInt(firstNumber); 
secondNumber = parseInt(secondNumber); 
for (let i = 1; i <= secondNumber; i++) {
  console.log(`${firstNumber} * ${i} = ${firstNumber * i}`);
}

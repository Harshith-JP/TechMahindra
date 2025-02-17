function checkSumEvenOrOdd(number) {
  let sum = 0;
  let numberStr = number.toString();
  
  for (let i = 0; i < numberStr.length; i++) {
    sum += parseInt(numberStr[i]);
  }

  if (sum % 2 === 0) {
    console.log(`The sum  ${sum}, is an even number.`);
  } else {
    console.log(`The sum  ${sum},  is an odd number.`);
  }
}

let num = prompt("Enter a number:");
checkSumEvenOrOdd(parseInt(num));

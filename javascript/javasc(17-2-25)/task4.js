const chooseOperation = () => {
  const operation = prompt("Choose an operation: add, subtract, multiply, divide");
  const num1 = parseFloat(prompt("Enter the first number:"));
  const num2 = parseFloat(prompt("Enter the second number:"));

  switch (operation) {
    case 'add':
      alert(`Sum: ${num1 + num2}`);
      break;
    case 'subtract':
      alert(`Difference: ${num1 - num2}`);
      break;
    case 'multiply':
      alert(`Product: ${num1 * num2}`);
      break;
    case 'divide':
      alert(`Quotient: ${num1 / num2}`);
      break;
    default:
      alert("Invalid");
  }
};

chooseOperation();

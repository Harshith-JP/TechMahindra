function product(){
let a =parseInt(prompt("number one"))
let b = parseInt(prompt("number for limit"))
for (let i = 1; i <= b; i++) {
  console.log(`${a} * ${i} = ${a * i}`);
}
}
product();

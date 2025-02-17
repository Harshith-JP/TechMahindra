let o = prompt("enter the number")

factors(o);
function factors(o){
console.log('${o} with factors')
  for(i = 0;i<o;i++){
  if(o%i==0){
    console.log(i)
}
}
}

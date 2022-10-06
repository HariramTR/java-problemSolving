function show(){
document.getElementById("iii").innerHTML="";
let fullname = "Hari ram";
let age = "25";
let city = "Ramnad";
let role = "Incubation";
let output="";
 output +=`<table border = '1'><tr><th>Name</th><td>${fullname}</td></tr>
  <tr><th>Age</th><td>${age}</td></tr>
 <tr><th>City</th><td>${city}</td></tr>
 <tr><th>role</th><td>${role}</td></tr></table>`;
 
//  document.body.innerHTML=output;
 const numbers = [1,2,3,4,5,6,7,8,9,10];
 console.log(numbers);
 //document.body.innerHTML=numbers;
 let sqrt = numbers.map((value)=>{return Math.sqrt(value);});
 console.table(sqrt);
//document.getElementById("iii").innerHTML=numbers;
 document.getElementById("fff").innerHTML=output;
 const user = [{name :"nivi",age:25,city:"kovai",salary:15000},
 {name :"hari",age:18,city:"ramnad",salary:25000},
 {name :"ram",age:20,city:"salem",salary:5000},
 {name :"babu",age:21,city:"madurai",salary:10000}];
 console.table(user);

//  document.getElementById("hhh").innerHTML=user;
 let eligible = user.map((users)=>({/*name:users.name,age:users.age,city:users.city,salary:users.salary,*/
 ...users,/*ithum oru type epdium podalam - ithu easy (or) another type inside note la irukuda hari*/
status:users.age>20?"Eligible":"Not eligible"}));
console.table(eligible);
var num = [1,2,3,4,5,6,7];
console.log(num);
console.log("slice : " +num.slice());
console.log("slice(2) :"+numbers.slice(2));
 //document.getElementById("mmm").innerHTML=eligible;
 const n1 = [1,2,3,4,5,6,7];
 console.log("Before splice : " +n1);
 let remove = n1.splice(2);
 console.log("removed items : " +remove);
 console.log("After splice : " +n1);
 const n2 = [1,2,3,4,5,6,7];
 console.log("Before splice : " +n2);
 let remove1 = n2.splice(2,2);
 console.log("removed items : " +remove1);
 console.log("After splice : " +n2);
 const n3 = [1,2,3,4,5,6,7];
 console.log("Before splice : " +n3);
 let remove2 = n3.splice(3,2,13,7);
 console.log("removed items : " +remove2);
 console.log("After splice : " +n3);
const n4 = [1,2,3,4,5,6,7];
n4.splice(2,0,100,300);
console.log(n4);
console.log("After splice :" +n4);
const a=[10,20,30];
const b=[40,50,60];
const c=[70,80,90];
let d = a.concat(b,c);
console.log(d);
const names =["Hari", "Ram", "Usha", "Nithya"];
names.sort();
console.log(names);
const num1 = [7,13,5,8,14];
num1.sort((a,b)=>{return a-b;});
console.log("compare sort : "+num1);
console.table(user);
user.sort((a,b)=>{return a.age-b.age;});
console.table(user);
const num2 = [11,6,20,-15,19];
num2.sort((a,b)=>{return a-b;});
console.log("compare sort : "+num2);
console.table(user);
user.sort((a,b)=>{return b.age-a.age;});
console.table(user);
user.sort((a,b)=>{if(a.name>b.name)return 1;
if(a.name<b.name)return -1; return 0});
console.table(user);
let k = [1,2,3,4,5,6,7];
k.fill(20);
console.log("Before fill : " +k);
console.log(k);
let k1 = [1,2,3,4,5,6,7];
 k1.fill(20,3);
console.log(k1);
let k2 = [1,2,3,4,5,6,7];
k2.fill(20,3,5);
console.log(k2);
const products = ["pen","pencil","Eraser","Box","scale","water bottle"];
let results = products.includes("pen");
console.log(results);
 results = products.includes("water bottle");
console.log(results);
results = products.includes("pen",2);
console.log(results);
results = products.includes("scale",3);
console.log(results);
let g = [1,2,3,4,5];
console.log(g);
console.log(g.push(17));
console.log (g);
 g.push(10,20,14,13);
console.log(g);
let fruits = ["Apple"];
console.log(fruits);
fruits.push("Orange");
console.log(fruits);
fruits.push("Banana", "Pineapple");
console.log(fruits);
let users1 = ["hari", "ram","kavi","ramesh"];
let users2 = ["ravi","mani"];
users1.push(...users2);
console.log(users1);
const oops = ['ram','mani','hari','ravi'];
console.log(oops);
console.log(oops.pop());
console.log(oops);
console.log(oops.pop());  
console.log(oops);
console.log("****Shift in JS*****");
let student = ["ram","ravi","hari","maran"];
console.log("Before shift : " +student);
const element = student.shift();
console.log("After shift : " +student);
console.log("Removed element : " +element);
console.log("****Unshift in JS*****");
let stu = ["ram","ravi","kumar","nivi"];
console.log(stu);
let len = stu.unshift("mani");
console.log(stu);
console.log(len);
len  = stu.unshift("ajith","kumar");
console.log(stu);
console.log(len);
 
}

 function Close(){
     document.getElementById("fff").innerHTML="closed";
 }
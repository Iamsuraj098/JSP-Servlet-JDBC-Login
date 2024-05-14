var notaccount = document.getElementsByClassName("bottom");
let lookup = document.getElementById("lookup");
let lookup2 = document.getElementById("lookup2");
let circle = document.getElementsByClassName("circle");
let home = document.getElementsByClassName("home");
let goback = document.getElementsByClassName("goback"); 
/*
notaccount[0].addEventListener("click", function () {
    lookup.style.opacity = "0";
    lookup.style.zIndex = "-1";
    lookup2.style.opacity = "1";
    lookup2.style.zIndex = "10";
    lookup2.style.transition = "0.5s";
})

notaccount[1].addEventListener("click", function () {
    lookup.style.opacity = "1";
    lookup.style.zIndex = "10";
    lookup.style.transition = "0.5s";
    lookup2.style.opacity = "0";
    lookup2.style.zIndex = "-1";
})*/

/*
let string1 = "";
let string2 = "";
let string3 = "";

var user = document.getElementById("userId");
var security = document.getElementById("password");

var newemail = document.getElementById("newEmail");
var newuser = document.getElementById("newuser");
var newpassword = document.getElementById("newpassword");

function register(k) {
    string1 = newuser.value
    string2 = newpassword.value
    string3 = newemail.value
    if((string1 == "")){
        alert("Please fill mention User Id");
    }
    else if((string3 == "")){
        alert("Please fill mention Email Id");
    }
    else if((string2 == "")){
        alert("Please fill mention password");
    }
    else if(string1 == "" || string3 == "" || string2 == ""){
        alert("Please fill mention user id, email id and password");
    }
    arr[k++] = {
        name: string1,
        Email: string3,
        password: string2
    }
    if(string1 != "" && string3 != "" && string2 != ""){
        lookup2.style.opacity = "0";
        lookup2.style.zIndex = "-1";
        circle[0].style.opacity = "1";
        circle[0].style.zIndex = "6";
        circle[0].innerHTML = `Succesfully Login, ${string1}`;
    }
}*/
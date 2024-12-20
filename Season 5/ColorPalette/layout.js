
function generateColors() {

    let colorArray = ["A", "B", "C", "D", "E", "F", "1", "2", "3", "4", "5", "6", "7", "8", "9"];

    let color1 = colorArray[Math.floor(Math.random() * colorArray.length)];
    let color2 = colorArray[Math.floor(Math.random() * colorArray.length)];
    let color3 = colorArray[Math.floor(Math.random() * colorArray.length)];
    let color4 = colorArray[Math.floor(Math.random() * colorArray.length)];
    let color5 = colorArray[Math.floor(Math.random() * colorArray.length)];
    let color6 = colorArray[Math.floor(Math.random() * colorArray.length)];

    return `#${color1}${color2}${color3}${color4}${color5}${color6}`
}

let color1 = document.querySelector(".color1");
let color2 = document.querySelector(".color2");
let color3 = document.querySelector(".color3");
let color4 = document.querySelector(".color4");
let color5 = document.querySelector(".color5");

color1.style.background = generateColors();
color2.style.background = generateColors();
color3.style.background = generateColors();
color4.style.background = generateColors();
color5.style.background = generateColors();

let text1 = document.querySelector("#text1");
let text2 = document.querySelector("#text2");
let text3 = document.querySelector("#text3");
let text4 = document.querySelector("#text4");
let text5 = document.querySelector("#text5");

text1.innerHTML = color1.style.background;
text2.innerHTML = color2.style.background;
text3.innerHTML = color3.style.background;
text4.innerHTML = color4.style.background;
text5.innerHTML = color5.style.background;

let button = document.querySelector("#btn");

button.addEventListener("click", () => {
    color1.style.background = generateColors();
    color2.style.background = generateColors();
    color3.style.background = generateColors();
    color4.style.background = generateColors();
    color5.style.background = generateColors();

})



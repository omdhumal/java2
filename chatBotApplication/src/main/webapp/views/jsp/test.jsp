<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import url("https://fonts.googleapis.com/css?family=Montserrat|Roboto");
html, body, div, span, applet, object, iframe,
h1, h2, h3, h4, h5, h6, p, blockquote, pre,
a, abbr, acronym, address, big, cite, code,
del, dfn, em, img, ins, kbd, q, s, samp,
small, strike, strong, sub, sup, tt, var,
b, u, i, center,
dl, dt, dd, ol, ul, li,
fieldset, form, label, legend,
table, caption, tbody, tfoot, thead, tr, th, td,
article, aside, canvas, details, embed,
figure, figcaption, footer, header, hgroup,
menu, nav, output, ruby, section, summary,
time, mark, audio, video {
  margin: 0;
  padding: 0;
  border: 0;
  font-size: 100%;
  font: inherit;
  vertical-align: baseline;
}

/* HTML5 display-role reset for older browsers */
article, aside, details, figcaption, figure,
footer, header, hgroup, menu, nav, section {
  display: block;
}

body {
  line-height: 1;
}

ol, ul {
  list-style: none;
}

blockquote, q {
  quotes: none;
}

blockquote:before, blockquote:after,
q:before, q:after {
  content: "";
  content: none;
}

table {
  border-collapse: collapse;
  border-spacing: 0;
}

*, *:before, *:after {
  box-sizing: border-box;
}

body {
  overflow-x: hidden;
  font-family: "Roboto", sans-serif;
  font-weight: 400;
  font-size: 16px;
  font-size: 1em;
  -moz-osx-font-smoothing: grayscale;
  -webkit-font-smoothing: antialiased;
  line-height: 1.45;
  background-color: #363636;
}

.chatbot__overview {
  background-color: #363636;
  display: flex;
  flex-flow: row nowrap;
  align-content: space-between;
  min-height: 80vh;
  max-height: 80vh;
  margin: 0 auto;
  padding: 1em;
  padding-bottom: 0;
}

.chatlist {
  font-family: inherit;
  font-size: 1em;
  display: flex;
  flex-flow: column nowrap;
  align-items: flex-end;
  overflow-x: hidden;
  width: 100%;
  max-width: 35em;
  max-height: 75vh;
  margin: 0 auto;
}
.chatlist .userInput, .chatlist .bot__output {
  padding: 0.85em;
  margin: 0.5em;
  max-width: 100%;
  background-color: #fff;
  border-radius: 5px;
  border-bottom: 1px solid #777;
}
.chatlist .userInput {
  text-transform: lowercase;
  box-shadow: 1px 1px 2px #666;
  border-top: 4px solid #CC8914;
  opacity: 0;
  animation-name: animateBubble;
  animation-duration: 400ms;
  animation-iteration-count: 1;
  animation-play-state: running;
  animation-fill-mode: forwards;
}
.chatlist .bot__output {
  align-self: flex-start;
  box-shadow: -1px 1px 2px #666;
  border-top: 4px solid #27ae60;
  will-change: auto;
  height: auto;
  opacity: 0;
  animation-name: animateBubble;
  animation-duration: 400ms;
  animation-iteration-count: 1;
  animation-play-state: paused;
  animation-fill-mode: forwards;
}
.chatlist .bot__output:last-child {
  display: none;
}
.chatlist .bot__command {
  color: #f5f5f5;
  color: #27ae60;
  font-weight: 600;
  padding: 0.1em;
}
.chatlist .bot__output:nth-child(1) {
  animation-delay: 600ms;
  animation-play-state: running;
}
.chatlist .bot__output:nth-child(2) {
  animation-delay: 1200ms;
  animation-play-state: running;
}
.chatlist .bot__output:nth-child(3) {
  animation-delay: 1800ms;
  animation-play-state: running;
}
.chatlist .bot__output--standard:last-child {
  display: block;
}
.chatlist .bot__output--failed {
  display: block !important;
}
.chatlist .bot__output--second-sentence {
  display: block;
}
.chatlist .bot__outputImage {
  max-width: 16em;
  height: 12em;
}

@keyframes animateBubble {
  0% {
    transform: translateY(-20%);
    opacity: 0;
  }
  100% {
    transform: translateY(0);
    opacity: 1;
  }
}
.block--background {
  background-color: #363636;
  width: 100vw;
  height: 100vh;
}

#chatform {
  display: flex;
  justify-content: center;
  width: 80%;
  max-width: 35em;
  margin: 0 auto;
  padding-top: 1em;
  font-size: 1em;
  font-family: Helvetica;
}
@media screen and (max-width: 29em) {
  #chatform {
    width: 90%;
  }
}

.chatbox-area {
  margin: 0 auto;
  position: relative;
  bottom: 0;
  height: auto;
  width: 100%;
}

textarea[name=chatbox] {
  resize: none;
  border: 2px solid #27ae60;
  border-right: 0;
  width: 70%;
  background-color: transparent;
  color: #fff;
  height: 3em;
  margin: 0;
  padding: 0.75em;
  border-radius: 8px 0px 0px 8px;
  font-family: inherit;
  font-size: 1em;
}
textarea[name=chatbox]:focus {
  outline: none;
  border: 2px solid #4bd786;
}

::-webkit-input-placeholder {
  /* WebKit, Blink, Edge */
  color: #fff;
}

:-moz-placeholder {
  /* Mozilla Firefox 4 to 18 */
  color: #fff;
  opacity: 1;
}

::-moz-placeholder {
  /* Mozilla Firefox 19+ */
  color: #fff;
  opacity: 1;
}

input[type=submit] {
  -webkit-appearance: none;
  appearance: none;
  border: 0;
  width: 25%;
  margin: 0;
  background-color: #27ae60;
  color: #fff;
  border: 2px solid #27ae60;
  border-left: 0;
  border-radius: 0 8px 8px 0;
  font-family: inherit;
  font-size: 1em;
  transition: 200ms all ease-in;
}
input[type=submit]:hover {
  background-color: #4bd786;
  border-color: #4bd786;
  color: #fff;
}

.input__nested-list {
  list-style: disc;
  list-style-position: inside;
  padding: 0.5em;
}
.input__nested-list:first-child {
  padding-top: 1em;
}

.input__nested-link {
  color: #2ecc71;
  text-decoration: none;
  border-bottom: 1px solid #2ecc71;
}

::-webkit-scrollbar {
  width: 0.65em;
  /* for vertical scrollbars */
  height: 0.65em;
  /* for horizontal scrollbars */
}

::-webkit-scrollbar-track {
  background: rgba(0, 0, 0, 0.1);
}

::-webkit-scrollbar-thumb {
  background: rgba(0, 0, 0, 0.3);
}

.alignTable{
margin-left: auto;
margin-right: auto;
background-color:#D5F5E3;
}


</style>
</head>
<body style="background-image: url('https://img.freepik.com/free-vector/colored-hacker-code-realistic-composition-with-person-creates-codes-hacking-stealing-information-vector-illustration_1284-18005.jpg?w=740&t=st=1668769055~exp=1668769655~hmac=a456956d7887bf8de18666ca606d1421cd046d3f254943c9788977d5586211ee');">

<table style="margin-left:auto; margin-right:auto; background-color:#D5F5E3" >
<td>
<tr><th style="background-color: purple"><h1>CHAT-BOT </h1></th></tr></td>
<td>
<main class="page__main">
    <div class="block--background">
      <div class="chatbot__overview">
        <ul class="chatlist">
          <li class="bot__output bot__output--standard">Hey, I'm Om! </li>
          <li class="bot__output bot__output--standard">How may I help you</li>
           <!--    <li class="bot__output bot__output--standard"><a href="https://onereset.citigroup.net/onereset/Pages/PasswordResets/PasswordReset.aspx">I will guide you to reset your password !</a></li>  --> 
          
               <li class="bot__output bot__output--standard"><a href="https://onereset.citigroup.net/onereset/Pages/PasswordResets/PasswordReset.aspx">reset password !</a></li> 
          
          
       <!--   <li class="bot__output bot__output--standard">
            <span class="bot__output--second-sentence">You can ask me a bunch of things!</span>
            <ul>
              <li class="input__nested-list">Something <span class="bot__command">about</span> Mees</li>
              <li class="input__nested-list">Mees' <span class="bot__command">best work</span></li>
              <li class="input__nested-list">Maybe I could <span class="bot__command">help</span> (for more instructions)</li>
              <li class="input__nested-list">Type <span class="bot__command">commands</span> for a list of every command</li>
            </ul>
            You could also scroll down to see Mees' full portfolio
          </li>
        </ul>  -->  
      </div>
      <div class="chatbox-area">
        <f:form action="" id="chatform">
            <textarea placeholder="Talk to me!" class="chatbox" name="chatbox" resize: "none" minlength="2"></textarea>
            <input class="submit-button" type="submit" value="send">
        </f:form>
      </div>
          <div class="block--background"></div>

</main>
</td>
</table>

<script type="text/javascript">
var sendForm = document.querySelector('#chatform'),
textInput = document.querySelector('.chatbox'),
chatList = document.querySelector('.chatlist'),
userBubble = document.querySelectorAll('.userInput'),
botBubble = document.querySelectorAll('.bot__output'),
animateBotBubble = document.querySelectorAll('.bot__input--animation'),
overview = document.querySelector('.chatbot__overview'),
hasCorrectInput,
imgLoader = false,
animationCounter = 1,
animationBubbleDelay = 600,
input,
previousInput,
isReaction = false,
unkwnCommReaction = "I didn't quite get that.",
chatbotButton = document.querySelector(".submit-button")

sendForm.onkeydown = function(e){
if(e.keyCode == 13){
e.preventDefault();

//No mix ups with upper and lowercases
var input = textInput.value.toLowerCase();

//Empty textarea fix
if(input.length > 0) {
  createBubble(input)
}
}
};

sendForm.addEventListener('submit', function(e) {
//so form doesnt submit page (no page refresh)
e.preventDefault();

//No mix ups with upper and lowercases
var input = textInput.value.toLowerCase();

//Empty textarea fix
if(input.length > 0) {
createBubble(input)
}
}) //end of eventlistener

var createBubble = function(input) {
//create input bubble
var chatBubble = document.createElement('li');
chatBubble.classList.add('userInput');

//adds input of textarea to chatbubble list item
chatBubble.innerHTML = input;

//adds chatBubble to chatlist
chatList.appendChild(chatBubble)

checkInput(input);
}

var checkInput = function(input) {
hasCorrectInput = false;
isReaction = false;
//Checks all text values in possibleInput
for(var textVal in possibleInput){
//If user reacts with "yes" and the previous input was in textVal
if(input == "yes" || input.indexOf("yes") >= 0){
  if(previousInput == textVal) {
    console.log("sausigheid");

    isReaction = true;
    hasCorrectInput = true;
    botResponse(textVal);
  }
}
if(input == "no" && previousInput == textVal){
  unkwnCommReaction = "For a list of commands type: Commands";
  unknownCommand("I'm sorry to hear that :(")
  unknownCommand(unkwnCommReaction);
  hasCorrectInput = true;
}
//Is a word of the input also in possibleInput object?
if(input == textVal || input.indexOf(textVal) >=0 && isReaction == false){
  console.log("succes");
  hasCorrectInput = true;
  botResponse(textVal);
}
}
//When input is not in possibleInput
if(hasCorrectInput == false){
console.log("failed");
unknownCommand(unkwnCommReaction);
hasCorrectInput = true;
}
}

//debugger;

function botResponse(textVal) {
//sets previous input to that what was called
// previousInput = input;

//create response bubble
var userBubble = document.createElement('li');
userBubble.classList.add('bot__output');

if(isReaction == true){
if (typeof reactionInput[textVal] === "function") {
//adds input of textarea to chatbubble list item
  userBubble.innerHTML = reactionInput[textVal]();
} else {
  userBubble.innerHTML = reactionInput[textVal];
}
}

if(isReaction == false){
//Is the command a function?
if (typeof possibleInput[textVal] === "function") {
  // console.log(possibleInput[textVal] +" is a function");
//adds input of textarea to chatbubble list item
  userBubble.innerHTML = possibleInput[textVal]();
} else {
  userBubble.innerHTML = possibleInput[textVal];
}
}
//add list item to chatlist
chatList.appendChild(userBubble) //adds chatBubble to chatlist

// reset text area input
textInput.value = "";
}

function unknownCommand(unkwnCommReaction) {
// animationCounter = 1;

//create response bubble
var failedResponse = document.createElement('li');

failedResponse.classList.add('bot__output');
failedResponse.classList.add('bot__output--failed');

//Add text to failedResponse
failedResponse.innerHTML = unkwnCommReaction; //adds input of textarea to chatbubble list item

//add list item to chatlist
chatList.appendChild(failedResponse) //adds chatBubble to chatlist

animateBotOutput();

// reset text area input
textInput.value = "";

//Sets chatlist scroll to bottom
chatList.scrollTop = chatList.scrollHeight;

animationCounter = 1;
}

function responseText(e) {

var response = document.createElement('li');

response.classList.add('bot__output');

//Adds whatever is given to responseText() to response bubble
response.innerHTML = e;

chatList.appendChild(response);

animateBotOutput();

console.log(response.clientHeight);

//Sets chatlist scroll to bottom
setTimeout(function(){
chatList.scrollTop = chatList.scrollHeight;
console.log(response.clientHeight);
}, 0)
}

function responseImg(e) {
var image = new Image();

image.classList.add('bot__output');
//Custom class for styling
image.classList.add('bot__outputImage');
//Gets the image
image.src = "/images/"+e;
chatList.appendChild(image);

animateBotOutput()
if(image.completed) {
chatList.scrollTop = chatList.scrollTop + image.scrollHeight;
}
else {
image.addEventListener('load', function(){
  chatList.scrollTop = chatList.scrollTop + image.scrollHeight;
})
}
}

//change to SCSS loop
function animateBotOutput() {
chatList.lastElementChild.style.animationDelay= (animationCounter * animationBubbleDelay)+"ms";
animationCounter++;
chatList.lastElementChild.style.animationPlayState = "running";
}

function commandReset(e){
animationCounter = 1;
previousInput = Object.keys(possibleInput)[e];
}

//hlep

var possibleInput = {
// "hlep" : this.help(),
"help" : function(){
responseText("You can type a command in the chatbox")
responseText("Something like &quot;Navvy, please show me Mees&rsquo; best work&quot;")
responseText("Did you find a bug or problem? Tweet me @MeesRttn")
commandReset(0);
return
},
"best work" : function(){
responseText("I will show you Mees' best work!");
responseText("These are his <a href='#animation'>best animations</a>")
responseText("These are his <a href='#projects'>best projects</a>")
responseText("Would you like to see how I was built? (Yes/No)")
commandReset(1);
return
},
"about" : function(){
responseText("This is me, Navvy's maker, Mees Rutten");
responseText("I'm a 22 year old Communication and Multimedia Design student");
responseText("My ambition is to become a great Creative Front-End Developer");
responseText("Would you like to know about Mees' vision? (Yes/No)");
commandReset(2);
return
},
"experience" : function(){
responseText("Mees has previously worked at:");
responseText("Cobra Systems as web- developer / designer");
responseText("BIT Students as web- developer / designer");
responseText("MediaMonks as a junior Front-end Developer");
commandReset(3);
return
},
"hobbies" : function(){
responseText("Mees loves:");
responseText("Coding complicated chatbots");
responseText("Family time");
responseText("Going out with friends");
responseText("Working out");
commandReset(4);
return
},
"interests" : function(){
responseText("Mees loves:");
responseText("Coding complicated chatbots");
responseText("Family time");
responseText("Going out with friends");
responseText("Working out");
commandReset(5);
return
},
"vision" : function(){
responseText("Things I want to learn or do:");
responseText("Get great at CSS & JS animation");
responseText("Create 3D browser experiences");
responseText("Learn Three.js and WebGL");
responseText("Combine Motion Design with Front-End");
commandReset(6);
return
},
"contact" : function(){
responseText("email: <a href='mailto:meesrutten@gmail.com?Subject=Hello%20Mees' target='_top'>send me a message</a>");
responseText("Twitter: <a href='https://twitter.com/meesrttn'>@MeesRttn</a>");
commandReset(7);
return
},
"commands" : function(){
responseText("This is a list of commands Navvy knows:")
responseText("help, best work, about, vision, experience, hobbies / interests, contact, rick roll");
commandReset(8);
return
},
"rick roll" : function(){
window.location.href = "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
},
// work experience
}

var reactionInput = {
"best work" : function(){
//Redirects you to a different page after 3 secs
responseText("On this GitHub page you'll find everything about Navvy");
responseText("<a href='https://github.com/meesrutten/chatbot'>Navvy on GitHub</a>")
animationCounter = 1;
return
},
"about" : function(){
responseText("Things I want to learn or do:");
responseText("Get great at CSS & JS animation");
responseText("Create 3D browser experiences");
responseText("Learn Three.js and WebGL");
responseText("Combine Motion Design with Front-End");
animationCounter = 1;
return
}
}

</script>


</body>
</html>
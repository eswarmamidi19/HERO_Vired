que = [
    {
        question:"1+1",
        Options:['2','1','3','5'],
        ans:0
    },{
        question:"1*10",
        Options:['1','2','12','10'],
        ans:3
    },{
        question:"10/10",
        Options:['infinity','7','1','14'],
        ans:2
    },{
        question:"28/2",
        Options:['3','14','35','4'],
        ans:1
    },{
        question:"0/0",
        Options:['infinity','1','2','3'],
        ans:0
    }
]
let marks = 0;
let quest = document.querySelector('.quest-head');
let submit = document.querySelector('#submit');
let opt = document.querySelector('.options');
let index = 0;
let qans = ''
let reload = ()=>{
    if(index == 5){
        document.querySelector('.container').innerHTML = '<h1>result</h1><br/><span>'+marks+'/5</span><br><button onclick="window.location.reload()">Reload</button>'
        return ""
    }
    quest.innerHTML = que[index].question;
    que[index].Options.forEach((option,i)=>{
        opt.innerHTML+="<div class='ans'> <input type='radio' name='opt' id='opt"+i+"'/><label for='opt"+i+"'>  "+option+"</label></div> <br/>"
    })
    let ans = document.querySelectorAll('.ans')
    ans.forEach((e,i)=>{
        e.addEventListener('click',()=>{
            qans = i;
        })
    })
}
reload();
submit.addEventListener('click',()=>{
    if(qans === que[index].ans)
        marks+=1;
    index++;
    qans = ""
    quest.innerHTML = ''
    opt.innerHTML = ''
    console.log(marks)
    reload()
})

// console.log(res);
// let prev;
// next_btn.addEventListener('click',()=>{
//      btns.forEach(btn=>{btn.classList.remove('wrong'); btn.classList.remove('correct') })
//       currentIndex=currentIndex+1;
//       if(currentIndex==5) {     
//           res.innerHTML =  `<h1>marks are ${c}</h1>`
//           return;
//     }
//       Question.innerHTML = Questions[currentIndex].Question;
//       btns.forEach((btn,i)=>{btn.innerHTML= Questions[currentIndex].options[i]})
//       btns.forEach((btn)=>{
//                 btn.addEventListener('click',(e)=>{
//                     if(e.target.innerText===Questions[currentIndex].options[Questions[currentIndex].correctIndex]){
//                         e.target.classList.add('correct')
//                     }
//                     else{
//                        e.target.classList.add('wrong');
//                        btns[Questions[currentIndex].correctIndex].classList.add('correct') 
//                     }
                    
//                })
//             })
    
// }) 



// reset_btn.addEventListener('click',()=>{
//     window.location.reload();
// })


// // function check(){
// //     c=0;
// //     btns.forEach((btn)=>{
// //         btn.addEventListener('click',(e)=>{
// //             if(e.target.innerText===Questions[currentIndex].options[Questions[currentIndex].correctIndex]){
// //                 e.target.classList.add('correct')
// //             }
// //             else{
// //                e.target.classList.add('wrong');
// //                btns[Questions[currentIndex].correctIndex].classList.add('correct') 
// //             }
            
// //        })
// //     })
// //     return c
// // }
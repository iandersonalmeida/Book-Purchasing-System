'use client'

import {useState, useEffect} from 'react';
import Link from 'next/link';
import { useSearchParams } from 'next/navigation';
//import SearchDisplay from '../search-display/page';

export function Search(){

  const[text, setText] = useState(''); 
  const[data, setData] = useState([]);
  const searchParams = useSearchParams();

  function handleChange(text:string){
      setText(text);         
    } 

  function getData(){   
    const promise = fetch(`http://localhost:2141/bookservice/api/v1/books/${text}`);
   //const promise =  fetch( "https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json");   
   promise.then(
    (response) =>{
      return response.json();
    }).then(
      (data) =>{       
        setData(data);
      })
 }

  function handleClick(){
       getData();
       /*let book = searchParams.getAll("data");       
       console.log(book.map((d:any)=>{
        return d.author;
       }));*/       
    }
   
    
    return(
        <div > 
          <form>                  
             <input  onChange={(e) => handleChange(e.target.value)} value={text} type="text" placeholder="Search your books..." className='border-2 border-solid border-slate-800 rounded-lg w-72 h-10 placeholder:italic sm:text-sm' required />   

             <Link
                 href={{
                  pathname:'/',
                  query:{data}
                 }}                  
             >      
                 <button type="submit" onClick={() => handleClick()} className="rounded-lg border-2 border-slate-800 ml-2 w-24 h-10  hover:bg-slate-100">Search </button>                  
          
             </Link> 

            </form>      

          {   <div>
              <br/>
              <br/>
              <ul>
                {data.map((d:any, idx)=>{
                  return <li key={idx}>Author: {d.author} Title: {d.title}</li>
                })}
              </ul>
            </div>    }   


      </div> 
    )
}


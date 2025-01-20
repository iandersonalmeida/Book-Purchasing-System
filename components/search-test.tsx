'use client'

import { useState } from 'react';
import {useEffect} from 'react';

export function searchPage(){
    const[search, setSearch] = useState('');
  const[data, setData] = useState(null)
    
  const url = "http://localhost:2141/bookservice/api/v1/books"

  function check(searchString:string){
    if(searchString == "Ian" || searchString == "Lisa"){
      alert(`${searchString} is a hero`);    
    }
    else
    alert(`${searchString} is not a hero`); 
    
  } 
  //-------------------------------------------------------------------------------------------  
 
  useEffect(() =>{

  });

  const getData = async (string:string) => {
    const response = await fetch(`http://localhost:2141/bookservice/api/v1/books/${string}`)
    const data = await response.json();
    setData(data);   
  
    <div className='relative overflow-x-auto  h-72'>
          <table>
            <thead className='text-xs uppercase  text-red-700'>
              <tr>
                <th className='px-6  py-6'>Title</th>
                <th className='px-6  py-6'>Author</th>
              </tr>
            </thead>
            <tbody>
              <tr className='border-y-2 text-blue-700'>
                <td className='px-6  py-2'>Book 1</td>
                <td className='px-6  py-2'>{search}</td>
              </tr>
              <tr className='border-y-2  text-blue-700'>
                <td className='px-6  py-2'>Book 2</td>
                <td className='px-6  py-2'>Ciclano</td>
              </tr>
            </tbody>
          </table>
        </div>
    
    
};  
//--------------------------------------------------------------------------------------------------------

  return (
   <main className="flex min-h-screen flex-col items-center justify-between p-24">
       <label className="mb-2 text-sm font-medium text-gray-900 sr-only dark:text-white">Search</label>
       <div className="relative">
           <div className="absolute inset-y-0 start-0 flex items-center ps-3 pointer-events-none">
           <svg className="w-4 h-4 text-gray-500 dark:text-gray-400" aria-hidden="true" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 20 20">
                <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="m19 19-4-4m0-7A7 7 0 1 1 1 8a7 7 0 0 1 14 0Z"/>
           </svg>
           </div>
           <input type="search" id="default-search"
           value={search}
           onChange={(e) => setSearch(e.target.value)}
           
            className="block w-full p-4 ps-10 text-sm text-gray-900 border border-gray-300 rounded-lg bg-gray-50 focus:ring-blue-500 focus:border-blue-500 dark:bg-gray-700 dark:border-gray-600 dark:placeholder-gray-400 dark:text-white dark:focus:ring-blue-500 dark:focus:border-blue-500"
             placeholder="Book Search..." required />             
           <button type="submit" 
           onClick={() => getData(search)}
           className="text-white absolute end-2.5 bottom-2.5 bg-blue-700 hover:bg-blue-800 focus:ring-4 focus:outline-none focus:ring-blue-300 font-medium rounded-lg text-sm px-4 py-2 dark:bg-blue-600 dark:hover:bg-blue-700 dark:focus:ring-blue-800">Search</button>
        </div>     
    </main>
  );
}
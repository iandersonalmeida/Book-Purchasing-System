'use client'

export function Search(){
    console.log("I am search component!")
    return(
        <div > 
        <form action=""> 
         <input type="text" placeholder="Search your books..." className='border-2 border-solid border-slate-800 rounded-lg w-72 h-10 placeholder:italic sm:text-sm' required />
         <button type="submit" className="rounded-lg border-2 border-slate-800 ml-2 w-24 h-10  hover:bg-slate-100">Search</button>
        </form>
      </div> 
    )
}
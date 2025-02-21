
'use client'

import Display from "@/app/display/page";
import searchProducts from "@/lib/products"
import Link from "next/link";

export function SearchButton(){
    
    function handleClick(){
        const data = searchProducts();
        console.log(data);
        <Display data={data} />
    }
    

    return(
        <>  
            <Link href='/display'>
                 <button onClick={handleClick}  type="submit" className="rounded-lg border-2 border-slate-800 ml-2 w-24 h-10  hover:bg-slate-100">Search </button>
            </Link>
        </>
    )
}
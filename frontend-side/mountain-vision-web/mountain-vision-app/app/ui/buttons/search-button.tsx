
'use client'

import Link from "next/link";

import { getProducts } from "@/app/display/page";

export function SearchButton(){
    
    function handleClick(){
        getProducts();
    }
    

    return(
        <>  
            <Link href='/display'>
                 <button onClick={handleClick}  type="submit" className="rounded-lg border-2 border-slate-800 ml-2 w-24 h-10  hover:bg-slate-100">Search </button>
            </Link>
        </>
    )
}
'use client'

import Link from "next/link"
export default function Display(
    {
        data,
    }: {
        data: Promise<any>
    }
){
    console.log(data);   

    return(        <>
             <h2>Products...</h2>           
             <Link href="/">
             Go back Home
             </Link>
             <ul>
                {data}
             </ul>
        </>
            
    )
}
'use client'

import { use } from "react"
export function ProductDisplay({
  products,
}:{
  products:Promise<string>
}
){
    const p = use(products);
    const obj = JSON.parse(p);

    
    return(
        <>
        <h1>Product Display Page</h1>
        <div>
        <ul>
          {obj.map((idx:any,data:any)=>{
            return <li key={idx}>{data.name}</li>
          })}
        </ul> 
        </div>

        <div>
          
        </div>
                       
        </>
    )
}
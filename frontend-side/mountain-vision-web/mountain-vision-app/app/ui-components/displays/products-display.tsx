'use client'

import { use } from "react";

export function ProductDisplay({productData}: any){

    const products =  use(productData);  
  
    return(
        <div>
            <h1>display page</h1>
        </div>
    )
    
}
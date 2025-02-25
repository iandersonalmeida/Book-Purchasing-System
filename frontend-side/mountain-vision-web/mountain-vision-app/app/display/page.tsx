
import Link from "next/link";
import { searchProducts } from "@/lib/products";
import { Suspense } from "react";
import { ProductDisplay } from "../ui/displays/product-display";

export function getProducts(){
  const data =  searchProducts();
   return data;
 }

export default function Display()
  {  
    const data = getProducts()
    const products = data;
    console.log("From display: ",products);
  

  
  return(
    <>  
    <Link href="/">Go back home</Link>
      <Suspense fallback={<p>Loading products...</p>}>
       <div>
        <ProductDisplay products={products} />
       </div> 
      </Suspense>      
    </>        
    
    )

}
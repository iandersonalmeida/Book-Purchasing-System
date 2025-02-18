import { ProductDisplay } from "../ui-components/displays/products-display"
import { Suspense } from "react"
export default function Display(){
    return(
        <Suspense fallback={<p>Loading...</p>}>
           <ProductDisplay />
        </Suspense>
    )
}
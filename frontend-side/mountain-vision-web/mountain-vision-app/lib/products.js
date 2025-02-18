import { ProductDisplay } from "@/app/ui-components/displays/products-display";

export default function searchProducts(){
    const productData = fetch("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json"); 
    return(
        <ProductDisplay productData={productData} />
    )
}

export default function searchProducts(){
    const data = fetch("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json");
    const products = data.then((result)=>{
        return result.json();
    })
    return products;
}
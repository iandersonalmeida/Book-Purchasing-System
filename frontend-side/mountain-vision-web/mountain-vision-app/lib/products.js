
//import { promises as fs } from "fs";


export async  function searchProducts(){
  // Local
//  const file = fs.readFile(process.cwd() + '/app/test.json','utf8');
 // const products  = JSON.parse(file);
   //const data = fetch('./test.json');

   //--------------------------------------------------------------
   //External API
   //const data = await fetch("https://microsoftedge.github.io/Demos/json-dummy-data/64KB.json")
   const data = await  fetch("https://mdn.github.io/learning-area/javascript/apis/fetching-data/can-store/products.json");
    const productData = await data.json();
    const products = JSON.stringify(productData);
    return products;
}
import {Search} from '@/components/Search';
import {Login} from '@/components/Login';


export default function homePage(){
  console.log("I am the homepage from console log!")
return(
  <main>
      <div >
        <h1 className="text-2xl text-blue-600 ml-2 ">Mountain Vision</h1> 
        <div className='-translate-y-7 flex justify-end mr-2'>
          <Login />  
        </div>           
      </div>
      <div className='flex justify-center mt-52'>
        <Search />
      </div>     

      
  </main>
)
 
}



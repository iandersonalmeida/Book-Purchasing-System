
import  Login  from './login-page/page';
import { Search } from './search-page/page';
import Link from 'next/link';

export default  function Home() {
  return (
    <div>

      <h1 className="text-2xl text-blue-600 ml-2 ">Mountain Vision</h1> 

      <div className="-translate-y-7 flex justify-end mr-2"> 
        <Link href="/login-page">
        <button className="border-2 border-slate-800  rounded-lg  w-20  hover:bg-slate-100 ">Login</button>
        </Link>
      </div> 

      <div className='flex justify-center mt-52'>
        <Search />
      </div>     
    </div>
  );
}

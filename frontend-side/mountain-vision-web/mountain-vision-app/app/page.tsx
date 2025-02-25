import Link from 'next/link'
import { SearchButton } from './ui/buttons/search-button';
import { LoginButton } from './ui/buttons/login-button';


export default function Home() {
  return (
    <div>

      <h1 className="text-2xl text-blue-600 ml-2 ">Mountain Vision</h1> 

      <div className="-translate-y-7 flex justify-end mr-2"> 
        <Link href="/login">
          <LoginButton />
        </Link>
      </div> 

      <div className='flex justify-center mt-52'>
        <SearchButton />
      </div>   
    </div>
  );
}

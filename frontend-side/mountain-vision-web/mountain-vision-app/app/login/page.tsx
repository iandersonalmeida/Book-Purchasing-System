import Link from 'next/link';


function Login(){
    return(       
        <div>
           <h1>Login Page</h1>
           <Link
              href="/"
            >
                Go Back Home
            </Link>

        </div>
       
       )
}

export default Login;
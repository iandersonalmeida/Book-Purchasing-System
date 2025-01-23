import Link from "next/link";

function SearchDisplay({searchParams}: any){
    const names = searchParams.data;
    return(
        <div>
             <h1>Show data here</h1>
             <Link
             href="/"
             >
                Go Back Home
             </Link>

             <div>
                <ul>
                    {names.map((d:any, idx:any)=>{
                        return <li key={idx}>{d.name}</li>
                    })}
                </ul>
             </div>
        </div>
       
    )
}

export default SearchDisplay;
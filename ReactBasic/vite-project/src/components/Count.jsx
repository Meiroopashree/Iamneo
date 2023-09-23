import React, { useState } from 'react';
const Count  =() =>
{
    const [count, setCount] = useState(10);
    const handle = () =>
    {
        if(count>0)
        {
            setCount(count-1); 
        }
        else
        {
            alert("End the count");
        }
    };

return(
        <div>
            <h1>{count}</h1>
            <button onClick ={handle}>Click</button>
        </div>
    );
}
export default Count
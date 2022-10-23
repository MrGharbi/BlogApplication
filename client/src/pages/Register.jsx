import React from 'react'
import {Link} from 'react-router-dom'

const Register = () => {
  return (
    <div className="auth">
      <h1>Register</h1>
      <form>
        <input type="text" placeholder='username' />
        <input type="password" placeholder='password' />
        <button>Register</button>
        <p>this is an error !</p>
        <span>Don't you have an account? <Link to='/register'>Register</Link></span>
      </form>
    </div>
  )
}

export default Register
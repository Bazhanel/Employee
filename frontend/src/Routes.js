import React from "react";
import { Route, Switch } from "react-router-dom";
import NotFound from "./containers/Handle404s/NotFound";
import LoginForm from "./containers/Login/LoginPage.jsx";

export default () =>
    <Switch>
        <Route path="/" exact component={LoginForm}/>
        <Route path="/login" exact component={LoginForm}/>
        <Route path="/home" exact component={Home}/>
        <Route component={NotFound}/>
    </Switch>;

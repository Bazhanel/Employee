/*
import React, {Component} from 'react';
import { connect } from 'react-redux';
import {Button, FormGroup, FormControl, ControlLabel, Panel, Navbar, Nav, NavItem} from 'react-bootstrap';
import './LoginForm.scss';
import LoaderButton from '../../components/LoaderButton/LoaderButton';
import {login} from '../../actions/user.actions';
import { Auth } from 'aws-amplify';

class LoginForm extends Component {
    constructor(props) {
        super(props);

        this.state = {
            isLoading: false,
            username: "",
            password: ""

        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);

    }

    validateForm() {
        return this.state.username.length > 0 && this.state.password.length > 0;
    }

    handleChange = event => {
        this.setState({
            [event.target.username]: event.target.value
        });
    }

    handleSubmit = async event => {
        event.preventDefault();
        try {
            this.setState({ isLoading: true });
            this.props.login(this.state).then(
                (res) => this.context.router.push('/home')
            );
            //this.props.history.push("/home");
        } catch (e) {
            alert(e.message);
            this.setState({ isLoading: false });
        }
    }

    render() {
        return (
            <div className="Login">
                <Panel>
                    <Panel.Heading>
                        <Panel.Title componentClass="h1">Authorization</Panel.Title>
                    </Panel.Heading>
                    <form onSubmit={this.handleSubmit}>
                        <FormGroup controlId="username" bsSize="large">
                            <ControlLabel>User Name</ControlLabel>
                            <FormControl
                                autoFocus
                                type="username"
                                value={this.state.username}
                                onChange={this.handleChange}
                            />
                        </FormGroup>
                        <FormGroup controlId="password" bsSize="large">
                            <ControlLabel>Password</ControlLabel>
                            <FormControl
                                value={this.state.password}
                                onChange={this.handleChange}
                                type="password"
                            />
                        </FormGroup>
                        <LoaderButton
                            block
                            bsSize="large"
                            enabled={!this.validateForm()}
                            type="submit"
                            isLoading={this.state.isLoading}
                            text="Login"
                            loadingText="Logging in…"
                        />
                    </form>
                    <Panel.Body></Panel.Body>
                </Panel>
            </div>
        );
    }
}

LoginForm.propTypes = {
    login: React.PropTypes.func.isRequired
}

LoginForm.contextTypes = {
    router: React.PropTypes.object.isRequired

}

export default connect (null, {login}) (LoginForm);
*/

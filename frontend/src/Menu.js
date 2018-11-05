import React, { Component } from 'react'
import { Header, Icon, Image, Menu, Segment, Sidebar } from 'semantic-ui-react'
import './Menu.scss'
import Tabs,{tab1} from './Tabs'

function exlode(i) {
    tab1(i);
}
// const Index = 2;
//
// export  {Index};
export default class SidebarExampleSidebar extends Component {

    fnk1 = (i) => exlode(i);
    handleHideClick = () => this.setState({
        className: 'hided' ,
        side: 'open-sidebar',
        clickSide: this.handleShowClick,
        icons:'closed',})

    handleShowClick = () => this.setState({
        className: 'showed' ,
        side: 'open-sidebar reverse',
        clickSide: this.handleHideClick,
        icons:'opened animate'})



    state = {className: 'hided' ,clickSide: this.handleShowClick ,side: 'open-sidebar',icons:'closed'}
    render() {

        const {className} = this.state;
        const {side} = this.state;
        const {clickSide} = this.state;
        const {icons} = this.state;

        return (
            <div>
                <Sidebar.Pushable

                    className='main'
                    as={Segment}>
                    <Sidebar

                        as={Menu}
                        animation='push'
                        icon='labeled'
                        inverted
                        vertical
                        className={className}
                        visible= {true}
                        width='thin'
                    >
                        <Menu.Item
                            onClick={clickSide}

                            className={side}
                            as='a'
                            >
                            >
                        </Menu.Item>
                        <Menu.Item  as='a' className='jopa' onClick={this.fnk1(1)}
                                   >
                            <Icon name='home' className={icons} />
                            <p className={className}>Штат</p>
                        </Menu.Item>
                        <Menu.Item  as='a'>

                            <Icon name='gamepad' className={icons}/>
                            <p className={className}>Групповые тренировки</p>
                        </Menu.Item>
{/*                        <Menu.Item as='a'
                                   >
                            <Icon name='camera' className={icons}/>
                            <p className={className}>Channels</p>
                        </Menu.Item>*/}
                        <Menu.Item
                            as='a'
                        >
                            <Icon name='edit' className={icons} />
                            <p className={className}>Справочник</p>
                        </Menu.Item>


                    </Sidebar>

                    <Sidebar.Pusher>

                        <Segment
                            basic>

                            <Header as='h3'>Application Content</Header>
                            {/*<Image src='/images/wireframe/paragraph.png' />*/}
<Tabs/>
                        </Segment>
                    </Sidebar.Pusher>
                </Sidebar.Pushable>
            </div>
        )

    }

}

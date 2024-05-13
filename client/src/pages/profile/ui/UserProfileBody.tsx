import { IUserProfileBodyProps } from '../model/interfaces';

const UserProfileBody: React.FC<IUserProfileBodyProps> = ({
	username,
	firstname,
	lastname,
	profileImg,
	qrCodeImg,
}) => {
	return (
		<div className='profile-page-grid'>
			<div className='profile-page-grid-item-upper'>
				<img className='profile-page-grid-item-upper-img' src={profileImg} />

				<div className='profile-page-grid-item-upper-text-name'>{`${firstname} ${lastname}`}</div>
				<div className='profile-page-grid-item-upper-text-login'>
					{username}
				</div>
			</div>
			<div className='profile-page-grid-item-lower'>
				<img className='profile-page-grid-item-lower-img' src={qrCodeImg} />
			</div>
		</div>
	);
};

export default UserProfileBody;
